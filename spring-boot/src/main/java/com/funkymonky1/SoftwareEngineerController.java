package com.funkymonky1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }
    @GetMapping("{id}")
    public SoftwareEngineer getEngineersbyId(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerbyId(id);
    }
    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {

        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
