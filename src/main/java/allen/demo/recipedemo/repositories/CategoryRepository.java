package allen.demo.recipedemo.repositories;

import allen.demo.recipedemo.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
