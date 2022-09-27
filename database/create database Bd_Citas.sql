create database Bd_Citas

create table Tbl_Pacientes (
    IdPaciente numeric(18) Not null,
    NomPaciente varchar(10) not null,
    ApellPaciente varchar(10)not null,
    FechaNacimientoPac date not null,
    GenPaciente char(10),
    primary key (IdPaciente)
) 

create table Tbl_Medico (
    IdMedico numeric(18) Not null,
    NomMedico varchar(10) not null,
    ApellMedico varchar(10) not null,
    primary key (IdMedico)
)

create table Tbl_Consultorio(
    IdConsultorio numeric(10, 0) not  null,
    NomConsultorio varchar (20) not null,
    primary key (IdConsultorio)
)

create table Tbl_Tratamientos (
    NumTratamiento numeric (10,0) not null,
    FechaAsignadaTratamiento date not null,
    DescripTratamiento varchar (1000) not null,
    FechaInicioTratamiento date,
    FechaFinalTratamiento  date,
    ObservacionesTratamiento varchar (1000),
    IdPaciente  numeric (18),
    primary key (NumTratamiento),
        FOREIGN KEY (IdPaciente) REFERENCES Tbl_Pacientes(IdPaciente)
 )

create table Tbl_Citas (
idCita numeric (10,0) not null,
FechaCita date not null,
HoraCita varchar (10) not null,
IdPaciente  numeric (18) not null,
IdMedico numeric(18) not null,
IdConsultorio numeric (10,0) not null,
CitaEstado varchar (20),
CitaObservaciones varchar (1000),
	primary key (IdCita),
    FOREIGN KEY (IdMedico) REFERENCES Tbl_Medico(IdMedico),
    FOREIGN KEY (IdPaciente) REFERENCES Tbl_Pacientes(IdPaciente),
    FOREIGN KEY (IdConsultorio) REFERENCES Tbl_Consultorio(IdConsultorio)
)