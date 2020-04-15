package com.dao;

import java.util.List;

import com.entities.GoodsRepair;

public interface GoodsRepairDao {
	public void add(GoodsRepair goodsRepair  );
	public List<GoodsRepair> findAll(int currentPage,int pageSize);
	public void delete(GoodsRepair goodsRepair   );
	public GoodsRepair findById(Integer id);
	public void update(GoodsRepair  goodsRepair);
	public int getTotle();
}
