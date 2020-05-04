package com.ahmed.lastcheack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablesController {

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

    @RequestMapping("/crud/datatables/advanced/multiple-controls.html")
    public String multipleControls() { return "/crud/datatables/advanced/multiple-controls"; }

    @RequestMapping("/crud/datatables/advanced/row-callback.html")
    public String rowCallback() { return "/crud/datatables/advanced/row-callback"; }

    @RequestMapping("/crud/datatables/advanced/row-grouping.html")
    public String rowGrouping() { return "/crud/datatables/advanced/row-grouping"; }

    /*
     * Datatables data-sources
     */

    @RequestMapping("/crud/datatables/data-sources/ajax-client-side.html")
    public String ajaxClientSide() { return "/crud/datatables/data-sources/ajax-client-side"; }

    @RequestMapping("/crud/datatables/data-sources/ajax-server-side.html")
    public String ajaxServerSide() { return "/crud/datatables/data-sources/ajax-server-side"; }

    @RequestMapping("/crud/datatables/data-sources/html.html")
    public String html() { return "/crud/datatables/data-sources/html"; }

    @RequestMapping("/crud/datatables/data-sources/javascript.html")
    public String javascript() { return "/crud/datatables/data-sources/javascript"; }

    /*
     * Datatables extensions
     */

    @RequestMapping("/crud/datatables/extensions/buttons.html")
    public String buttons() { return "/crud/datatables/extensions/buttons"; }

    @RequestMapping("/crud/datatables/extensions/colreorder.html")
    public String colreorder() { return "/crud/datatables/extensions/colreorder"; }

    @RequestMapping("/crud/datatables/extensions/keytable.html")
    public String keytable() { return "/crud/datatables/extensions/keytable"; }

    @RequestMapping("/crud/datatables/extensions/responsive.html")
    public String responsive() { return "/crud/datatables/extensions/responsive"; }

    @RequestMapping("/crud/datatables/extensions/rowgroup.html")
    public String rowgroup() { return "/crud/datatables/extensions/rowgroup"; }

    @RequestMapping("/crud/datatables/extensions/rowreorder.html")
    public String rowreorder() { return "/crud/datatables/extensions/rowreorder"; }

    @RequestMapping("/crud/datatables/extensions/scroller.html")
    public String scroller() { return "/crud/datatables/extensions/scroller"; }

    @RequestMapping("/crud/datatables/extensions/select.html")
    public String select() { return "/crud/datatables/extensions/select"; }

    /*
     * Datatables search-options
     */

    @RequestMapping("/crud/datatables/search-options/advanced-search.html")
    public String advancedSearch() { return "/crud/datatables/search-options/advanced-search"; }

    @RequestMapping("/crud/datatables/search-options/column-search.html")
    public String columnSearch() { return "/crud/datatables/search-options/column-search"; }

}
