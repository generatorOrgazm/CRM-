package ru.bagi.crmservice.service;

import org.springframework.stereotype.Service;
import ru.bagi.crmservice.model.Position;
import ru.bagi.crmservice.repository.PositionRepository;
import java.util.List;

/**
 * Сервис для управления должностями
 */
@Service
public class PositionService {
    private final PositionRepository repository;

    public PositionService(PositionRepository repository) {
        this.repository = repository;
    }

    /**
     Возвращает все должности
     */
    public List<Position> getAll() { return repository.findAll(); }

    /**
     * Сохраняет должность
     */
    public Position save(Position position) { return repository.save(position); }

    /**
     * Удаляет должность
     */
    public void delete(Long id) { repository.deleteById(id); }
}