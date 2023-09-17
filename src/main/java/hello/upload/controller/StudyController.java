package hello.upload.controller;

import hello.upload.dto.CheckBox;
import hello.upload.dto.SelectTag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/tag")
public class StudyController {

    @GetMapping("/select")
    public String showView() {
        return "study";
    }

    @ResponseBody
    @PostMapping("/select")
    public String selectTag(@ModelAttribute SelectTag tag, @RequestParam("checkBox") CheckBox checkBox) {

        int fruitName = Integer.parseInt(tag.getFruitName());
        log.info("과일이름 = {}", fruitName);
        log.info("checkBox1 = {} ", checkBox.getIsCheck1());
        log.info("checkBox1 = {} ", checkBox.getIsCheck2());
        log.info("checkBox1 = {} ", checkBox.getIsCheck3());

        return "ok";
    }
}
