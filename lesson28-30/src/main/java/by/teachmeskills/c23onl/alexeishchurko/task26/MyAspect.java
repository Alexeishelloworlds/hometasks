package by.teachmeskills.c23onl.alexeishchurko.task26;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;


@Component
@Aspect
public class MyAspect {

    //@Pointcut("execution(public int by.teachmeskills.c23onl.alexeishchurko.task26.service.impl.RacingCompetitionImpl.compete())")
    @Pointcut("@annotation(by.teachmeskills.c23onl.alexeishchurko.task26.ExecutionTime)")
    public void pointCut(){
    }

    @Around("pointCut()")
    public int measureRaceTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        int value = (Integer) joinPoint.proceed();
        long end = System.nanoTime();
        System.out.println("Время гонки = " + (end - start) + " ns");
        return value;
    }
}