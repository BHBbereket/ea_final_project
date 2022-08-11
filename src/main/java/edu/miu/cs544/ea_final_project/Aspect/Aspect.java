package edu.miu.cs544.ea_final_project.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@EnableAspectJAutoProxy
@Component
public class Aspect {
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.JobService.deleteJob(..))")
    public void deleteJob(){}
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.UserService.deleteUser(..))")
    public void deleteUser(){}
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.ApplicationService.deleteApplication(..))")
    public void deleteApplication(){}
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.interviewService.InterviewService.deleteScreening(..))")
    public void deleteScreening(){}
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.interviewService.InterviewService.deleteHiring(..))")
    public void deleteHiring(){}
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.interviewService.InterviewService.deleteTechnicalInterview(..))")
    public void deleteTechincal(){}
    @Pointcut("execution(* edu.miu.cs544.ea_final_project.servies.companyService.CompanyService.deleteCompany(..))")
    public void deleteCompany(){}

    @After("deleteApplication()||deleteCompany()||deleteHiring()||deleteJob()||deleteScreening()||deleteTechincal()||deleteUser()")
    public void afterDelete(JoinPoint joinPoint)throws Throwable{
        System.out.println("After the delete operation trigered by \n"+joinPoint.getSignature().getDeclaringTypeName()+"" +
                " - "+joinPoint.getSignature().getName());
    }

}
