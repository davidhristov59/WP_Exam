package mk.ukim.finki.wp.kol2024g1.model.exceptions;

public class InvalidReservationIdException extends RuntimeException {
    public InvalidReservationIdException(Long id) {
        super("The reservation with id " + id + " is not found");
    }
}
