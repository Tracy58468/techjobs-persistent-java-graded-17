package org.launchcode.techjobs.persistent.controllers;

import jakarta.validation.Valid;
import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Skill;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("skills/") // Had to add "/" so the redirect in processAddEmployerForm would work correctly. However, with most web pages, it doesn't matter whether you append a "/" to the end of the URL or not. I want to figure out how to make that work here.

public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("title", "All Skills");
        model.addAttribute("skills", skillRepository.findAll());

        return "skills/index";
    }

    @GetMapping("add")
    public String displayAddSkillForm(Model model) {

        model.addAttribute(new Skill());

        return "skills/add";
    }

    @PostMapping("add")
    public String processAddSkillForm(@ModelAttribute @Valid Skill newSkill, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "skills/add";
        }

        skillRepository.save(newSkill); // using the variable to send the input to the database via the data layer

        return "redirect:";
    }

    @GetMapping("view/{skillId}")
    public String displayViewSkill(Model model, @PathVariable int skillId) {

        Optional optSkill = skillRepository.findById(skillId);
        if (optSkill.isPresent()) {
            Skill skill = (Skill) optSkill.get();
            model.addAttribute("skill", skill);
            return "skills/view";
        } else {
            return "redirect:../";
        }

    }

}
