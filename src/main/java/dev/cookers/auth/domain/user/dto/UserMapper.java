package dev.cookers.auth.domain.user.dto;

import dev.cookers.auth.core.generic.AbstractMapper;
import dev.cookers.auth.domain.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends AbstractMapper<User, UserDTO> {
  User fromUserRegisterDTO(UserRegisterDTO dto);
}
