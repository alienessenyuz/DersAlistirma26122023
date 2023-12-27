package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServisi {

    private static final List<String> OGRENCI_LISTESI = new ArrayList<>();

    static {
        OGRENCI_LISTESI.add(new Ogrenci("Ali Veli", "2"));
        OGRENCI_LISTESI.add(new Ogrenci("Ayse Fatma", "2"));
        OGRENCI_LISTESI.add(new Ogrenci("Mehmet Emin", "3"));
    }

    @GetMapping("/")
    public List<String> listele() {
        return OGRENCI_LISTESI;
    }
}
