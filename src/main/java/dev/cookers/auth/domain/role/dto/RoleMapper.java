package dev.cookers.auth.domain.role.dto;

import dev.cookers.auth.core.generic.AbstractMapper;
import dev.cookers.auth.domain.role.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends AbstractMapper<Role, RoleDTO> {
}

