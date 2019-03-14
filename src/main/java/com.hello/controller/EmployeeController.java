package com.hello.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hello.model.BankCard;
import com.hello.model.Employee;
import com.hello.service.IEmployeeService;
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
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private IEmployeeService employeeService;
    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/select")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long employeeId = Long.parseLong(request.getParameter("id"));
        Employee employee = selectEmployee(employeeId);
        mv.addObject("message", employee.toString());
        mv.setViewName("employee_select");
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(employee));
        response.getWriter().close();
    }

    @RequestMapping("/addEmployee")
    public ModelAndView addEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        BankCard bankCard = new BankCard();
        bankCard.setBank(request.getParameter("bank"));
        bankCard.setCardId(request.getParameter("cardId"));
        bankCard.setCardStatus(1);
        bankCard.setPassword(request.getParameter("bankPwd"));
        bankCard.setUsername(request.getParameter("bankUserName"));
        String tel = request.getParameter("tel");
        String extraInfo = request.getParameter("extraInfo");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String sex = request.getParameter("sex");
        String type = request.getParameter("type");

        Employee employee = new Employee();
        employee.setEmployeeBankCardInfo(bankCard);
        employee.setEmployeeExtraInfo(extraInfo);
        employee.setEmployeeName(name);
        employee.setEmployeePassword(pwd);
        employee.setEmployeeSalary(salary);
        employee.setEmployeeSex(sex);
        employee.setEmployeeTel(tel);
        employee.setEmployeeType(type);
        try{
            int id = this.insertEmployee(employee);
            if(id != -1){
                mv.addObject("isSuccess", true);
                mv.setViewName("employee_add_result_success");
            } else {
                mv.addObject("isSuccess", false);
                mv.setViewName("employee_add_result_fail");
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info(e.getMessage());
        }finally {
            return mv;
        }
    }

    private int insertEmployee(Employee employee){
        int id = this.employeeService.insertEmployee(employee);
        return id;
    }

    @RequestMapping("/updateEmployee")
    public ModelAndView updateEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        BankCard bankCard = new BankCard();
        bankCard.setBank(request.getParameter("bank"));
        bankCard.setCardId(request.getParameter("cardId"));
        bankCard.setCardStatus(1);
        bankCard.setPassword(request.getParameter("bankPwd"));
        bankCard.setUsername(request.getParameter("bankUserName"));
        String tel = request.getParameter("tel");
        String extraInfo = request.getParameter("extraInfo");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String sex = request.getParameter("sex");
        String type = request.getParameter("type");

        Employee employee = new Employee();
        employee.setEmployeeBankCardInfo(bankCard);
        employee.setEmployeeExtraInfo(extraInfo);
        employee.setEmployeeName(name);
        employee.setEmployeePassword(pwd);
        employee.setEmployeeSalary(salary);
        employee.setEmployeeSex(sex);
        employee.setEmployeeTel(tel);
        employee.setEmployeeType(type);
        int id = 0;
        try{
            id = this.updateEmployee(employee);
        }catch (Exception e){
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        if(id != -1){
            Logger.error("更新成功");
            mv.addObject("isSuccess", true);
            mv.setViewName("employee_update_result_success");
        } else {
            Logger.error("更新失败");
            mv.addObject("isSuccess", false);
            mv.setViewName("employee_update_result_fail");
        }
        return mv;
    }

    @RequestMapping("/deleteEmployeeById")
    public ModelAndView deleteEmployeeByid(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long employeeId = Long.parseLong(request.getParameter("id"));
        boolean isSuccess = false;
        try{
            this.deleteEmployeeByid(employeeId);
            isSuccess = true;
        }catch (Exception e){
            isSuccess = false;
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        mv.addObject("isSuccess", isSuccess);
        mv.setViewName("employee_delete_result");
        return mv;
    }

    private Employee selectEmployee(long id){
        Employee employee = this.employeeService.selectEmployee(id);
        return employee;
    }

    private void deleteEmployeeByid(long id){
        this.employeeService.deleteEmployeeById(id);
    }

    private void deleteEmployee(Employee employee){
        this.employeeService.deleteEmployee(employee);
    }

    private int updateEmployee(Employee employee){
        int id = this.employeeService.updateEmployee(employee);
        return id;
    }

}
