package com.skcet.day7.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day7.Model.FoodModel;

public interface FoodRepos extends JpaRepository<FoodModel, Integer> {

}
