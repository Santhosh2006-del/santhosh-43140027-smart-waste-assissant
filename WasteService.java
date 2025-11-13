package com.swa3.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.swa3.model.Waste;
import com.swa3.repository.WasteRepository;

@Service
public class WasteService {
    private final WasteRepository repo;

    public WasteService(WasteRepository repo) {
        this.repo = repo;
    }

    public List<Waste> getAll() {
        return repo.findAll();
    }

    public Waste add(Waste waste) {
        return repo.save(waste);
    }
}
