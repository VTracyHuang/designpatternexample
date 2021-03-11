package com.tracy;

import com.tracy.pattern.springmvc.DispatcherServlet;

/**
 * created by huangyating
 *
 * @Date 2021/3/1
 */
public class ResponsibilityChain {

    public static void main(String[] args) {

       /*
       	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception{
		HandlerExecutionChain mappedHandler = null;
        mappedHandler = getHandler(processedRequest);
       	}
        //在mappedHandler.applyPreHandle内部得到了HandlerIntercepter intercepter
        //调用了拦截器的 interceptor.postHandle
        @Nullable
        protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
            if (this.handlerMappings != null) {
                for (HandlerMapping mapping : this.handlerMappings) {
                    HandlerExecutionChain handler = mapping.getHandler(request);
                    if (handler != null) {
                        return handler;
                    }
                }
            }
            return null;
        }






        //说明：在mappedHandler.applyPreHandler内部中获取到拦截器，并调用拦截器的
      	mappedHandler.applyPostHandle(processedRequest, response, mv);

        //说明：在mappedHandler.apply
        还调用了triggerrAffterCompletion方法
        */
       //springmvc 请求的流程图中，执行了拦截器的相关方法 interceptor.preHandler等等//
        // 在处理SpringMVC请求时，使用到职责链模式，还使用到适配器模式
        //HandlerExceutionChain主要负责的是请求拦截器的执行和请求处理，但是他本身
        //不处理请求，只是将请求分配给链上注册处理器执行，这是职责链实现方式，减少
        //职责链本身与处理逻辑之间的耦合，规范了处理流程
        //HandlerExecutionChain维护了HandlerInterceptor的集合，可以向其中注册相应的拦截器
    }
}
