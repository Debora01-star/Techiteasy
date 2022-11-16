package nl.rodriguezmontaldo.Techiteasy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionControllers {

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions() {
        return ResponseEntity.ok("televisions");

    }

    @GetMapping("/television/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable("id") int id) {
        return ResponseEntity.ok("television with id: " + id);

    }

    @PostMapping("/television")
    public ResponseEntity<Object> addTelevision(@RequestBody String television) {
        return ResponseEntity.created(null).body("television");

    }

    @PutMapping("/television/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody String television) {
        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/television/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id) {
        return ResponseEntity.noContent().build();

    }
}