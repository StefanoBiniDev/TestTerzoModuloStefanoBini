use Passeggeri;

create table if not exists `passeggeri` (
	`id_passeggero` int not null auto_increment,
	`nome` varchar(120) not null,
	`cognome` varchar(120) not null,
	`data_prenot` varchar(120) not null,
	`n_volo` int not null,
	`compagnia_aerea` varchar(120) not null,
	primary Key(`id_passeggero`)
)
engine = InnoDB
default CHARSET = utf8mb4
collate = utf8mb4_0900_ai_ci;

INSERT INTO passeggeri (nome, cognome,data_prenot,n_volo,Compagnia_aerea) VALUES('luca','dkdkd','08/03/22',101,'Ryanair'),('giovanni','dkdkd','01/01/20',102,'Lufthansa'),('daniele','dkdkd','04/05/23',104,'Lufthansa');
Alter table students add column n_volo int ;
Alter table students add column nome varchar(30);
TRUNCATE TABLE passeggeri;
DROP TABLE passeggeri;
