create table consulta (
	horario varchar(8),
	codigo varchar(4) primary key,
	paciente varchar(4), 
	foreign key(paciente) references paciente(codigo),
	medico varchar(4),
	foreign key(medico) references medico(codigo)
)