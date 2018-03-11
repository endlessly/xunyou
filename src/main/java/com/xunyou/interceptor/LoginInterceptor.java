package com.xunyou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xunyou.exception.Fail;
import com.xunyou.model.UserEntity;
import com.xunyou.utils.ResultMsgDto;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        request.setCharacterEncoding("UTF-8");
        String url = request.getServletPath();
        if (!url.equals("")) {
            //判斷是否已登录
            UserEntity loginUser = (UserEntity) request.getSession().getAttribute("user");
            if (loginUser == null) {
                if (request.getMethod().trim().toLowerCase().equals("post")) {
                    ResultMsgDto resultMsgDto = new ResultMsgDto();
                    throw new Fail("用户未登录");
                } else {
                    //無session則是未登录狀態
                    System.out.println(">>>未登录，請重新登录<<<");
                    response.sendRedirect("user/login");
                }

                return false;
            }
        }
        return true;
        //return super.preHandle(request, response, handler);
    }
    /*private boolean isPassUrl(String url){
        if(!url.endsWith("/login/login")
                && !url.endsWith("/login/chnagePassEntry")
                && !url.endsWith("/login/change_Login")
                && !url.endsWith("/API/Service")
                && !url.endsWith("/API/Service2")
                && !url.endsWith("/province.txt")
                && !url.endsWith("/city.txt")
                && !url.endsWith("/area.txt")
                && !url.endsWith(".xml")
                && !url.endsWith(".js")
                && !url.endsWith(".css") && !url.endsWith(".png")
                && !url.endsWith(".CSS") && !url.endsWith(".CSS")
                && !url.endsWith(".jpg") && !url.endsWith(".gif")
                && !url.endsWith(".JPG") && !url.endsWith(".GIF")){
            return true;
        }

        return false;
    }*/

}