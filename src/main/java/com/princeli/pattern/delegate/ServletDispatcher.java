package com.princeli.pattern.delegate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: pattern-demo
 * @description: ${description}
 * @author: ly
 * @create: 2018-07-24 09:20
 **/
public class ServletDispatcher {
    private List<Handler> handlerMapping=new ArrayList<Handler>();
    public ServletDispatcher(List<Handler> handlerMapping) {
        try{
            Class<?> memberActionClass=MemberAction.class;
            handlerMapping.add(new Handler()
                    .setController(memberActionClass.newInstance())
                    .setMethod(memberActionClass.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response){
        doDispatch(request,response);
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response){
        //1.获取用户请求的url
        //如果按照j2ee标准，每个url会对应一个servlet，url由浏览器输入
        //而现在使用委派模式，就只需要配一个url，其他的都交给该类统一管理
        String uri=request.getRequestURI();
        //2.servlet拿到url以后要做权衡（要做判断、要做选择）
        //根据用户请求的url，去找到这个url对应的某一个java类的方法

        //3.通过拿到的url去handlerMapping中找（我们把它认为是策略常量）
        Handler handler=null;
        for(Handler h:handlerMapping){
            if(uri.equals(h.getUrl())){
                handler=h;
                break;
            }
        }
        //4.将具体的任务分发给method（通过反射去调用其对应的方法）
        Object object=null;
        try {
            object=handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        }catch (Exception e){
            e.printStackTrace();
        }

        //5.获取到method的执行结果，通过response返回出去
        //response.getWriter().write();
    }

}
