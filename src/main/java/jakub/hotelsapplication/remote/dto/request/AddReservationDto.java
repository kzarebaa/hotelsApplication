package jakub.hotelsapplication.remote.dto.request;

import jakub.hotelsapplication.remote.dto.common.RoomReservationDto;
import jakub.hotelsapplication.remote.dto.common.PersonReservationDto;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> hotels;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

    public AddReservationDto(List<RoomReservationDto> hotels, PersonReservationDto person) {
        this.hotels = hotels;
        this.person = person;
    }
}
