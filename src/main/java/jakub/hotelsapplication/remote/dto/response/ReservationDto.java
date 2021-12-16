package jakub.hotelsapplication.remote.dto.response;

import jakub.hotelsapplication.domain.ReservationStatus;
import jakub.hotelsapplication.remote.dto.common.PersonReservationDto;
import jakub.hotelsapplication.remote.dto.common.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatus status;
    private List<RoomReservationDto> rooms;
    private PersonReservationDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatus status, List<RoomReservationDto> rooms, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}