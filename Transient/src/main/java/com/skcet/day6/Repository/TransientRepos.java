package com.skcet.day6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day6.Model.TransientModel;

public interface TransientRepos extends JpaRepository<TransientModel, Integer> {

}
