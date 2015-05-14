package org.jeewframework.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * ∂®“Â loginController.do
 * Created by yuanwenfei on 2015/5/14.
 */
@Controller
@RequestMapping("/loginController")
public class LoginController extends BaseController {

    /**
     * /loginController.do?goPwdInit
     * @return
     */
    @RequestMapping(params = "pwdInit")
    public ModelAndView goPwdInit() {
        ModelAndView modelAndView = new ModelAndView(new RedirectView("loginController.do?login"));
        return modelAndView;
    }

    @RequestMapping(params = "login")
    @ResponseBody
    public String login(HttpServletRequest request) {
        System.out.print("login.................");
        return "/webpage/index.jsp";
    }

    @RequestMapping(params = "checkuser")
    @ResponseBody
    public String checkuser(){
        return "check user success";
    }
}
