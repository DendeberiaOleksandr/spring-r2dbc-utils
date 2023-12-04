package org.odendeberia.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageableResponse<T> {

    private List<T> data;
    private long totalElements;

}
