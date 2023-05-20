package com.example.InjectionService.controller;
import com.example.InjectionService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    String requestScopeID1;
    String requestScopeID2;

    String prototypeScopeID1;
    String prototypeScopeID2;

    String singletonScopeID1;
    String singletonScopeID2;

   private final WebRequestScope _webRequestScopeService1;
   private final WebRequestScope _webRequestScopeService2;

   private final PrototypeScope _prototypeScopeService1;
   private final PrototypeScope _prototypeScopeService2;

    private final SingletonScope _singletonScopeService1;
    private final SingletonScope _singletonScopeService2;

    @Autowired
    public HomeController( WebRequestScope webRequestScopeService1,
                           WebRequestScope webRequestScopeService2,
                           PrototypeScope prototypeScopeService1,
                           PrototypeScope prototypeScopeService2,
                           SingletonScope singletonScopeService1,
                           SingletonScope singletonScopeService2){
        _webRequestScopeService1 = webRequestScopeService1;
        _webRequestScopeService2 = webRequestScopeService2;
        _prototypeScopeService1 = prototypeScopeService1;
        _prototypeScopeService2 = prototypeScopeService2;
        _singletonScopeService1 = singletonScopeService1;
        _singletonScopeService2 = singletonScopeService2;

    }


    @GetMapping("/")
    public String viewHomePage(Model model) {
        requestScopeID1 = _webRequestScopeService1.GetOperationID().toString();
        requestScopeID2 = _webRequestScopeService2.GetOperationID().toString();
        prototypeScopeID1 = _prototypeScopeService1.GetOperationID().toString();
        prototypeScopeID2 = _prototypeScopeService2.GetOperationID().toString();
        singletonScopeID1 = _singletonScopeService1.GetOperationID().toString();
        singletonScopeID2 = _singletonScopeService2.GetOperationID().toString();
        model.addAttribute("RequestScope1", requestScopeID1);
        model.addAttribute("RequestScope2", requestScopeID2);
        model.addAttribute("prototypeScope1", prototypeScopeID1);
        model.addAttribute("prototypeScope2", prototypeScopeID2);
        model.addAttribute("singletonScope1", singletonScopeID1);
        model.addAttribute("singletonScope2", singletonScopeID2);
        return "home";
    }
}
