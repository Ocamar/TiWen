create index IX_2F233819 on M_Bed (locationId);
create index IX_347B2A19 on M_Bed (locationId, bedNo);

create index IX_B57CE8F on M_Location (companyId, groupId);
create unique index IX_79CB9F59 on M_Location (locationNo, companyId, groupId);

create index IX_E94120BE on M_Node (locationId);
create unique index IX_241BFDB1 on M_Node (nodeNo);

create index IX_A88FA728 on M_Patient (febrile, discharge);
create index IX_8223A2E1 on M_Patient (febrile, discharge, deleted);
create unique index IX_C4354300 on M_Patient (mrn);

create unique index IX_FE28E166 on M_SystemParameter (locationId, key_);

create unique index IX_1439F0DD on M_Tag (tagNo);