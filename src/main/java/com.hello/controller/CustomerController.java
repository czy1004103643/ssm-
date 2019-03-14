package com.hello.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hello.model.Customer;
import com.hello.model.Customer;
import com.hello.model.User;
import com.hello.service.ICustomerService;
import com.hello.utils.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private ICustomerService customerService;
    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/Login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long customerId = Long.parseLong(request.getParameter("id"));
        User user = selectCustomer(customerId);
        mv.addObject("message", user.toString());
        mv.setViewName("customer_select");
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping("/addCustomer")
    public ModelAndView addCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String company = request.getParameter("company");
        String pwd = request.getParameter("pwd");
        double accountPrice = Double.parseDouble(request.getParameter("accountPrice"));
        String email = request.getParameter("email");
        String grade = request.getParameter("grade");
        String sex = request.getParameter("sex");
        String tel = request.getParameter("tel");
        Customer customer = new Customer();
        customer.setCompany(company);
        customer.setCustomerPwd(pwd);
        customer.setCustomerAccountPrice(accountPrice);
        customer.setCustomerEmail(email);
        customer.setCustomerGrade(grade);
        customer.setCustomerSex(sex);
        customer.setCustomerStatus("1");
        customer.setCustomerTel(tel);
        int id = 0;
        try{
            id = this.insertCustomer(customer);
        }catch (Exception e){
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        if(id != -1){
            mv.addObject("isSuccess", true);
            mv.setViewName("customer_add_result_success");
        } else {
            mv.addObject("isSuccess", false);
            mv.setViewName("customer_add_result_fail");
        }
        return mv;
    }

    private int insertCustomer(Customer customer){
        int id = this.customerService.insertCustomer(customer);
        return id;
    }

    @RequestMapping("/updateCustomer")
    public ModelAndView updateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String company = request.getParameter("company");
        String pwd = request.getParameter("pwd");
        double accountPrice = Double.parseDouble(request.getParameter("accountPrice"));
        String email = request.getParameter("email");
        String grade = request.getParameter("grade");
        String sex = request.getParameter("sex");
        String tel = request.getParameter("tel");
        Customer customer = new Customer();
        customer.setCompany(company);
        customer.setCustomerPwd(pwd);
        customer.setCustomerAccountPrice(accountPrice);
        customer.setCustomerEmail(email);
        customer.setCustomerGrade(grade);
        customer.setCustomerSex(sex);
        customer.setCustomerStatus("1");
        customer.setCustomerTel(tel);
        int id = 0;
        try{
            id = this.updateCustomer(customer);
        }catch (Exception e){
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        if(id != -1){
            Logger.error("更新成功");
            mv.addObject("isSuccess", true);
            mv.setViewName("customer_update_result_success");
        } else {
            Logger.error("更新失败");
            mv.addObject("isSuccess", false);
            mv.setViewName("customer_update_result_fail");
        }
        return mv;
    }

    @RequestMapping("/deleteCustomerById")
    public ModelAndView deleteCustomerByid(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long customerId = Long.parseLong(request.getParameter("id"));
        boolean isSuccess = false;
        try{
            this.deleteCustomerByid(customerId);
            isSuccess = true;
        }catch (Exception e){
            isSuccess = false;
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        mv.addObject("isSuccess", isSuccess);
        mv.setViewName("customer_delete_result");
        return mv;
    }

    private User selectCustomer(long id){
        User customer = this.customerService.selectCustomer(id);
        return User;
    }

    private void deleteCustomerByid(long id){
        this.customerService.deleteCustomerById(id);
    }

    private void deleteCustomer(Customer customer){
        this.customerService.deleteCustomer(customer);
    }


    private int updateCustomer(Customer customer){
        int id = this.customerService.updateCustomer(customer);
        return id;
    }

}
