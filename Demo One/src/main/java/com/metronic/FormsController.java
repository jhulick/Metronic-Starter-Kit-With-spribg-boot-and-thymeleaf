package com.ahmed.lastcheack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormsController {

    /*
     * File upload
     */

    @RequestMapping("/crud/file-upload/dropzonejs.html")
    public String dropzonejs() { return "/crud/file-upload/dropzonejs"; }

    @RequestMapping("/crud/file-upload/metronic-avatar.html")
    public String metronicAvatar() { return "/crud/file-upload/metronic-avatar"; }

    @RequestMapping("/crud/file-upload/uppy.html")
    public String uppy() { return "/crud/file-upload/uppy"; }

    /*
     * Forms - controls
     */

    @RequestMapping("/crud/forms/controls/base.html")
    public String base() { return "/crud/forms/controls/base"; }

    @RequestMapping("/crud/forms/controls/checkbox.html")
    public String checkbox() { return "/crud/forms/controls/checkbox"; }

    @RequestMapping("/crud/forms/controls/input-group.html")
    public String inputGroup() { return "/crud/forms/controls/input-group"; }

    @RequestMapping("/crud/forms/controls/option.html")
    public String option() { return "/crud/forms/controls/option"; }

    @RequestMapping("/crud/forms/controls/radio.html")
    public String radio() { return "/crud/forms/controls/radio"; }

    @RequestMapping("/crud/forms/controls/switch.html")
    public String switch2() { return "/crud/forms/controls/switch"; }

    /*
     * Forms - editors
     */

    @RequestMapping("/crud/forms/editors/bootstrap-markdown.html")
    public String bootstrapMarkdown() { return "/crud/forms/editors/bootstrap-markdown"; }

    @RequestMapping("/crud/forms/editors/ckeditor-balloon.html")
    public String ckeditorBalloon() { return "/crud/forms/editors/ckeditor-balloon"; }

    @RequestMapping("/crud/forms/editors/ckeditor-balloon-block.html")
    public String ckeditorBalloonBlock() { return "/crud/forms/editors/ckeditor-balloon-block"; }

    @RequestMapping("/crud/forms/editors/ckeditor-classic.html")
    public String ckeditorClassic() { return "/crud/forms/editors/ckeditor-classic"; }

    @RequestMapping("/crud/forms/editors/ckeditor-document.html")
    public String ckeditorDocument() { return "/crud/forms/editors/ckeditor-document"; }

    @RequestMapping("/crud/forms/editors/ckeditor-inline.html")
    public String ckeditorInline() { return "/crud/forms/editors/ckeditor-inline"; }

    @RequestMapping("/crud/forms/editors/quill.html")
    public String quill() { return "/crud/forms/editors/quill"; }

    @RequestMapping("/crud/forms/editors/summernote.html")
    public String summernote() { return "/crud/forms/editors/summernote"; }

    @RequestMapping("/crud/forms/editors/tinymce.html")
    public String tinymce() { return "/crud/forms/editors/tinymce"; }

    /*
     * Forms - layouts
     */

    @RequestMapping("/crud/forms/layouts/action-bars.html")
    public String actionBars() { return "/crud/forms/layouts/action-bars"; }

    @RequestMapping("/crud/forms/layouts/default-forms.html")
    public String defaultForms() { return "/crud/forms/layouts/default-forms"; }

    @RequestMapping("/crud/forms/layouts/multi-column-forms.html")
    public String multiColumnForms() { return "/crud/forms/layouts/multi-column-forms"; }

    @RequestMapping("/crud/forms/layouts/sticky-action-bar.html")
    public String stickyActionBar() { return "/crud/forms/layouts/sticky-action-bar"; }

    /*
     * Forms - validation
     */

    @RequestMapping("/crud/forms/validation/form-controls.html")
    public String formControls() { return "/crud/forms/validation/form-controls"; }

    @RequestMapping("/crud/forms/validation/form-widgets.html")
    public String formWidgets() { return "/crud/forms/validation/form-widgets"; }

    @RequestMapping("/crud/forms/validation/states.html")
    public String states() { return "/crud/forms/validation/states"; }


    /*
     * Forms - widgets
     */

    @RequestMapping("/crud/forms/widgets/autosize.html")
    public String autosize() { return "/crud/forms/widgets/autosize"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-datepicker.html")
    public String bootstrapDatepicker() { return "/crud/forms/widgets/bootstrap-datepicker"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-daterangepicker.html")
    public String bootstrapDaterangepicker() { return "/crud/forms/widgets/bootstrap-daterangepicker"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-datetimepicker.html")
    public String bootstrapDatetimepicker() { return "/crud/forms/widgets/bootstrap-datetimepicker"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-maxlength.html")
    public String bootstrapMaxlength() { return "/crud/forms/widgets/bootstrap-maxlength"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-multipleselectsplitter.html")
    public String bootstrapMultipleSelectSplitter() { return "/crud/forms/widgets/bootstrap-multipleselectsplitter"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-select.html")
    public String bootstrapSelect() { return "/crud/forms/widgets/bootstrap-select"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-switch.html")
    public String bootstrapSwitch() { return "/crud/forms/widgets/bootstrap-switch"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-timepicker.html")
    public String bootstrapTimepicker() { return "/crud/forms/widgets/bootstrap-timepicker"; }

    @RequestMapping("/crud/forms/widgets/bootstrap-touchspin.html")
    public String bootstrapTouchspin() { return "/crud/forms/widgets/bootstrap-touchspin"; }

    @RequestMapping("/crud/forms/widgets/clipboard.html")
    public String clipboard() { return "/crud/forms/widgets/clipboard"; }

    @RequestMapping("/crud/forms/widgets/form-repeater.html")
    public String formRepeater() { return "/crud/forms/widgets/form-repeater"; }

    @RequestMapping("/crud/forms/widgets/input-mask.html")
    public String inputMask() { return "/crud/forms/widgets/input-mask"; }

    @RequestMapping("/crud/forms/widgets/ion-range-slider.html")
    public String ionRangeSlider() { return "/crud/forms/widgets/ion-range-slider"; }

    @RequestMapping("/crud/forms/widgets/nouislider.html")
    public String nouislider() { return "/crud/forms/widgets/nouislider"; }

    @RequestMapping("/crud/forms/widgets/recaptcha.html")
    public String recaptcha() { return "/crud/forms/widgets/recaptcha"; }

    @RequestMapping("/crud/forms/widgets/select2.html")
    public String select2() { return "/crud/forms/widgets/select2"; }

    @RequestMapping("/crud/forms/widgets/tagify.html")
    public String tagify() { return "/crud/forms/widgets/tagify"; }

    @RequestMapping("/crud/forms/widgets/typeahead.html")
    public String typeahead() { return "/crud/forms/widgets/typeahead"; }

}
