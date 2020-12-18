package allen.demo.recipedemo.controllers;

import allen.demo.recipedemo.domain.Category;
import allen.demo.recipedemo.domain.UnitOfMeasure;
import allen.demo.recipedemo.repositories.CategoryRepository;
import allen.demo.recipedemo.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println(
                categoryOptional.get().getId() + "\n" +
                unitOfMeasureOptional.get().getId()
        );
        return "index";
    }

}
