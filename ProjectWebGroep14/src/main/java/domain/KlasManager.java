/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Jeroen
 */
public interface KlasManager {
        public List<Klas> getItems();
        public Leerling getLeerling(int id);
}
