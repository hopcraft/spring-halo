package io.hopcraft.halo.mapper;

import io.hopcraft.halo.bean.Product;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public interface ProductMapper extends BaseMapper<Product> {
  public List<Product> products();
}
