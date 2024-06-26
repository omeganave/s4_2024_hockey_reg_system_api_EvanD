package com.keyin.rest.player;

import com.keyin.rest.division.Division;
import com.keyin.rest.division.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    // Since you already had all the methods done yourself, I've removed them and have written
    // the methods myself. Same with PlayerController and PlayerRepo.

    @GetMapping("/player")
    public List<Player> getAllPlayers() { return playerService.getAllPlayers(); }

    @GetMapping("/player/{id}")
    public Player getPlayerById(@PathVariable long id) { return playerService.getPlayerById(id); }

    @PostMapping("/player")
    public Player createPlayer(@RequestBody Player player) { return playerService.createPlayer(player); }

    @PutMapping("/player/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable long id, @RequestBody Player player) { return ResponseEntity.ok(playerService.updatePlayer(id, player)); }

    @DeleteMapping("/player/{id}")
    public void deletePlayerById(@PathVariable long id) { playerService.deletePlayerById(id); }
}
