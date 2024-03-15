package dev.cookers.auth.domain.authority.dto;

import dev.cookers.auth.core.generic.AbstractMapper;
import dev.cookers.auth.domain.authority.Authority;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorityMapper extends AbstractMapper<Authority, AuthorityDTO> {
}
