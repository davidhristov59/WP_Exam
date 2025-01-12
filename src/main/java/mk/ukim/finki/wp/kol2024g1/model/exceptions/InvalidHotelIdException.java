package mk.ukim.finki.wp.kol2024g1.model.exceptions;

public class InvalidHotelIdException extends RuntimeException {
    public InvalidHotelIdException(Long id) {
        super("The hotel with id" + id + " is not found");
    }
}
