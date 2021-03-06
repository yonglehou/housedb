package com.github.coolcool.sloth.lianjiadb.service;
import java.util.*;
import com.github.coolcool.sloth.lianjiadb.model.Houseindex;
import com.github.coolcool.sloth.lianjiadb.common.Page;

import javax.annotation.Generated;

@Generated(
	value = {
		"https://github.com/coolcooldee/sloth",
		"Sloth version:1.0"
	},
	comments = "This class is generated by Sloth"
)
public interface HouseindexService{

	Integer save(Houseindex houseindex);

	Integer count();

	Houseindex getById(Object id);

	Houseindex getByCode(String code);

	void deleteById(Object id);

	void update(Houseindex houseindex);

	List<Houseindex> list();

	Page<Houseindex> page(int pageNo, int pageSize);

	List<Houseindex> listTodayUnCheck(int start, int step);

	List<Houseindex> listTodayHasNotDetail(int start, int step);

	void setTodayChecked(String code);

	Integer increment();
}