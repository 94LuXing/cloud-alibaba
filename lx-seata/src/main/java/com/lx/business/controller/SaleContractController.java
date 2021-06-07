//package com.lx.business.controller;
//
//
//import com.lx.business.entity.SaleContract;
//import com.lx.business.feign.StockFeignService;
//import com.lx.business.service.SaleContractService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * <p>
// * 销售合同主表 前端控制器
// * </p>
// *
// * @author luxing
// * @since 2021-05-24
// */
//@RestController
//@RequestMapping("/saleContract")
//public class SaleContractController {
//
//    @Autowired
//    private SaleContractService saleContractService;
//
//    @Autowired
//    private StockFeignService stockFeignService;
//
//    @GetMapping(value = "/getById")
//    public String getById(@RequestParam String id){
//        SaleContract byId = saleContractService.getById(id);
//        System.out.println(byId.toString());
//        return byId.toString() + 124;
//    }
//
//    @GetMapping(value = "/feignTest")
//    public String feignTest(@RequestParam String id){
//        String byStockId = stockFeignService.getByStockId(id);
//        return byStockId;
//    }
//
//}
//
