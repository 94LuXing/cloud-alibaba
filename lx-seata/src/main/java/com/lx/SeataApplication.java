package com.lx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@MapperScan({"com.lx.**.mapper"})
@SpringBootApplication
public class SeataApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SeataApplication.class, args);
    }
}
