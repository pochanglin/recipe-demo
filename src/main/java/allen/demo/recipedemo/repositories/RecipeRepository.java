package allen.demo.recipedemo.repositories;

import allen.demo.recipedemo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
