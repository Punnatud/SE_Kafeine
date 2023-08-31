package ku.cs.Kafeine.service;

import ku.cs.Kafeine.entity.Category;
import ku.cs.Kafeine.entity.Menu;
import ku.cs.Kafeine.model.MenuRequest;
import ku.cs.Kafeine.repository.CategoryRepository;
import ku.cs.Kafeine.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Menu> getAllMenus(){
        return menuRepository.findAll();
    }

    public void create(MenuRequest request){
        Menu record = modelMapper.map(request, Menu.class);
        Category category =
                categoryRepository.findById(request.getCategoryId()).get();
        record.setCategory(category);
        menuRepository.save(record);
    }
}
