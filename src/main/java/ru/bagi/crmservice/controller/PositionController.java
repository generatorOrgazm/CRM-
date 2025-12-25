package ru.bagi.crmservice.controller;

import org.springframework.web.bind.annotation.*;
import ru.bagi.crmservice.model.Position;
import ru.bagi.crmservice.service.PositionService;
import java.util.List;

/**
 * Контроллер для управления должностями
 */
@RestController
@RequestMapping("/positions")
public class PositionController {
    private final PositionService service;

    public PositionController(PositionService service) {
        this.service = service;
    }

    /**
     * Получить все должности
     */
    @GetMapping
    public List<Position> getAll() { return service.getAll(); }

    /**
     * Добавить новую должность
     */
    @PostMapping
    public Position create(@RequestBody Position position) {
        return service.save(position);
    }

    /**
     * Удалить должность
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}