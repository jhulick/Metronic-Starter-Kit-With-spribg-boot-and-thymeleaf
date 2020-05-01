package com.ahmed.lastcheack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {
    @RequestMapping(value = {"/", "/index.html"}, method= RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    /*
     * Datatables basic mappings
     */

    @RequestMapping("/crud/datatables/basic/basic.html")
    public String basic() { return "/crud/datatables/basic/basic"; }

    @RequestMapping("/crud/datatables/basic/headers.html")
    public String headers() { return "/crud/datatables/basic/headers"; }

    @RequestMapping("/crud/datatables/basic/paginations.html")
    public String paginations() { return "/crud/datatables/basic/paginations"; }

    @RequestMapping("/crud/datatables/basic/scrollable.html")
    public String scrollable() { return "/crud/datatables/basic/scrollable"; }

    /*
     * Datatables advanced mappings
     */

    @RequestMapping("/crud/datatables/advanced/column-rendering.html")
    public String columnRendering() { return "/crud/datatables/advanced/column-rendering"; }

    @RequestMapping("/crud/datatables/advanced/column-visibility.html")
    public String columnVisibility() { return "/crud/datatables/advanced/column-visibility"; }

    @RequestMapping("/crud/datatables/advanced/footer-callback.html")
    public String footerCallback() { return "/crud/datatables/advanced/footer-callback"; }

    @RequestMapping("/crud/datatables/advanced/row-callback.html")
    public String rowCallback() { return "/crud/datatables/advanced/row-callback"; }
}

