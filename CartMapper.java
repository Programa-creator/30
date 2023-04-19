package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CartMapper implements RowMapper<Cart> {

    @Override
    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        Cart cart = new Cart();
        // додаткові поля можна заповнювати тут
        return cart;
    }
}
