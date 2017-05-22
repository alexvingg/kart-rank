package br.com.kart.rank.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexcosta on 19/05/17.
 */
public class Race {

    private List<Lap> lapList;

    public List<Lap> getLapList() {
        return lapList == null ? lapList = new ArrayList<Lap>() : lapList;
    }

}
