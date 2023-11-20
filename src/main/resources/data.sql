insert into tb_credenciado (
TIPO_CREDENCIADO,ID,NOME  ) values (1,1,'Mirna Klauser');
insert into tb_credenciado (
TIPO_CREDENCIADO,ID,NOME  ) values (1,2,'Monica Silva');
insert into tb_credenciado (
TIPO_CREDENCIADO,ID,NOME  ) values (1,3,'Mauro Silva Paes');
insert into tb_credenciado (
TIPO_CREDENCIADO,ID,NOME  ) values (1,4,'Mateus Souto Maior');

insert into tb_especialidade(ID_ESPECIALIDADE,DESCRICAO_ESP ) values(1,'Cardiologia');
insert into tb_especialidade(ID_ESPECIALIDADE,DESCRICAO_ESP ) values(2,'Pneumologia');

insert into tb_cred_especialidade(ESPECIALIDADES_ID_ESPECIALIDADE  ,CREDENCIADO_ID )values
(1,1);
insert into tb_cred_especialidade(ESPECIALIDADES_ID_ESPECIALIDADE  ,CREDENCIADO_ID )values
(1,2);
insert into tb_cred_especialidade(ESPECIALIDADES_ID_ESPECIALIDADE  ,CREDENCIADO_ID )values
(1,3);
insert into tb_cred_especialidade(ESPECIALIDADES_ID_ESPECIALIDADE  ,CREDENCIADO_ID )values
(2,2);

insert into tb_tp_planos(ID_PLANOS ,DESCRICAO_TP_PLANOS)  values(1,'Basico');
insert into tb_tp_planos(ID_PLANOS ,DESCRICAO_TP_PLANOS)  values(2,'Plus');

insert into tb_cred_planos (TIPOS_PLANOS_ID_PLANOS ,CREDENCIADO_ID ) values
(1,1);
insert into tb_cred_planos (TIPOS_PLANOS_ID_PLANOS ,CREDENCIADO_ID ) values
(1,2);
insert into tb_cred_planos (TIPOS_PLANOS_ID_PLANOS ,CREDENCIADO_ID ) values
(1,3);

insert into tb_tp_credenciados(ID_TIPO_CREDENCIADO,DESCRICAO_TP_CREDENCIADO ) values(1,'Consultorio');
insert into tb_tp_credenciados(ID_TIPO_CREDENCIADO,DESCRICAO_TP_CREDENCIADO ) values(2,'Clinica')  ;

insert into tb_endereco_credenciado(CREDENCIADO_ID,ID_ENDERECO_CREDENCIADO,	DESCRICAO_ENDERECO ,
FONE ,MUNICIPIO, UF ) values (1,1,'Rua dos Andradas, 515','156662-7388','Campinas' ,'SP');

insert into tb_endereco_credenciado(CREDENCIADO_ID,ID_ENDERECO_CREDENCIADO,	DESCRICAO_ENDERECO ,
FONE ,MUNICIPIO, UF ) values (2,1,'Rua Maranhão, 12515','1176662-7598','São Paulo' ,'SP');

insert into tb_endereco_credenciado(CREDENCIADO_ID,ID_ENDERECO_CREDENCIADO,	DESCRICAO_ENDERECO ,
FONE ,MUNICIPIO, UF ) values (3,1,'Rua Pintassilgo, 320','118976-3232','São Paulo' ,'SP');

