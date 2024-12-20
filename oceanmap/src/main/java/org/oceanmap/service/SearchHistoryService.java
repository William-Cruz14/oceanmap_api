
package org.oceanmap.service;

import org.oceanmap.dto.SearchHistoryDTO;
import org.oceanmap.model.SearchHistory;
import org.oceanmap.repository.SearchHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchHistoryService {

    @Autowired
    private SearchHistoryRepository searchHistoryRepository;


    public void saveSearchHistory(SearchHistory searchHistory) {
        searchHistoryRepository.save(searchHistory);
    }

    public void RemoveSearchHistory(SearchHistory searchHistory) {
        searchHistoryRepository.delete(searchHistory);
    }

    public List<SearchHistory> findAllByid (Long userId){
        return  searchHistoryRepository.findAllById(userId);
    }

    public SearchHistory fromDTO (SearchHistoryDTO history){
        return new SearchHistory(
                history.getId(),
                history.getUser(),
                history.getBeachAddress(),
                history.getSearchDate()
        );

    }


}