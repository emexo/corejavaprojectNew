package com.emexo.designpattern.chainofresposibility;


public class TestChainOfResponsibility {
    public static void main(String[] args)
    {

        SupportService supportService = new SupportService();
        FrontDeskSupport frontDeskSupport = new FrontDeskSupport();
        SupervisorSupport supervisorSupport = new SupervisorSupport();
        ManagerSupport managerSupport = new ManagerSupport();
        DirectorSupport directorSupport = new DirectorSupport();

        supportService.setHandler(frontDeskSupport);
        ServiceRequest request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());


    }
}
