package com.tomo.brewerymicro.repositories;

import com.tomo.brewerymicro.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>
{
}
