package org.example.controller;


public class MainController {

//    @PostMapping("/api/proposals")
    public String search(String action,String size,String page){
        return """
                {
                    "totalItems": 82,
                    "pageNumber": 0,
                    "limit": 20,
                    "items": [
                        {
                            "id": "0124502a-8ab1-4d73-a9bc-f4a288adb7d7",
                            "name": "Программа моделирования автомобильных самоорганизующихся сетей VANET",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "35b827d4-ecf9-424f-903c-1491deadcb99",
                                "name": "Чугунков Илья Владимирович",
                                "email": "IVChugunkov@mephi.ru"
                            },
                            "department": {
                                "id": "c5be0664-12e3-418a-bb3c-038904bf9a12",
                                "shortName": "445",
                                "name": "Исследовательский центр в сфере искусственного интеллекта по направлению (Транспорт и логистика) НИЯУ МИФИ"
                            },
                            "creationDate": "2024-11-03T10:39:19.357993Z",
                            "agreementDate": "2024-11-28T13:35:00.947217Z"
                        },
                        {
                            "id": "0130e290-9159-4320-8494-d2b3bf3b8a6b",
                            "name": "Программа распознавания артефактов на изображениях мазков крови и костного мозга в системах компьютерной микроскопии с применением технологий искусственного интеллекта",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "a6c96c3d-68f0-43f4-ad38-f9527d3d2319",
                                "name": "Никитаев Валентин Григорьевич",
                                "email": "VGNikitayev@mephi.ru"
                            },
                            "department": {
                                "id": "07252c30-7ef0-4571-9c9d-de87e4315933",
                                "shortName": "46",
                                "name": "Кафедра компьютерных медицинских систем"
                            },
                            "creationDate": "2024-04-08T11:53:33.142107Z",
                            "agreementDate": "2024-06-05T18:37:24.949258Z"
                        },
                        {
                            "id": "04f198f6-3a70-477a-a5c8-92117d150f04",
                            "name": "Программа для расчета переходных процессов в резонансно-туннельных наноструктурах",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "3c39a5af-47a7-47f5-9bca-99cc0e4bcab3",
                                "name": "Гришаков Константин Сергеевич",
                                "email": "KSGrishakov@mephi.ru"
                            },
                            "department": {
                                "id": "cfd116a5-79f5-4676-8052-0e0a7f804f60",
                                "shortName": "401",
                                "name": "Институт функциональной ядерной электроники"
                            },
                            "creationDate": "2022-06-14T09:52:34.777477Z",
                            "agreementDate": "2022-08-04T17:46:52.645884Z"
                        },
                        {
                            "id": "0778fed3-24b9-4943-86b9-008117e5f353",
                            "name": "Программа для корпоративного портала НИЯУ МИФИ 1.2",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "a286b9b1-2ed6-4fed-b285-9783558e9646",
                                "name": "Александров Алексей Игоревич",
                                "email": "aialeksandrov@mephi.ru"
                            },
                            "department": {
                                "id": "d4cffb9a-3864-4572-889e-ef395c8b3e43",
                                "shortName": "391",
                                "name": "Управление информационно-методического обеспечения образовательного процесса"
                            },
                            "creationDate": "2023-10-03T14:00:49.829344Z",
                            "agreementDate": "2023-11-27T17:06:35.929376Z"
                        },
                        {
                            "id": "0c8feea9-2748-4634-9532-9515b1385cae",
                            "name": "Программа моделирования атомно-зондовых данных APT Modeler v 1.0",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "a959f0b3-8f0c-40b2-8e27-e886318ede2f",
                                "name": "Шутов Антон Сергеевич",
                                "email": "ASShutov@mephi.ru"
                            },
                            "department": {
                                "id": "a859eb5e-2486-4543-83a7-4c2a7b71705c",
                                "shortName": "60",
                                "name": "Кафедра физики экстремальных состояний вещества"
                            },
                            "creationDate": "2023-12-12T15:27:29.916226Z",
                            "agreementDate": "2024-01-09T12:03:55.294342Z"
                        },
                        {
                            "id": "0e5ed681-7bb5-46f5-896a-65e6a0dde5a6",
                            "name": "Программа для мобильных устройств \\"НИЯУ МИФИ. Личный кабинет\\"",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "733c35f4-89fe-4104-96e2-e1a4e6c26cab",
                                "name": "Крючков Георгий Константинович",
                                "email": "GKKryuchkov@mephi.ru"
                            },
                            "department": {
                                "id": "d4cffb9a-3864-4572-889e-ef395c8b3e43",
                                "shortName": "391",
                                "name": "Управление информационно-методического обеспечения образовательного процесса"
                            },
                            "creationDate": "2022-06-10T03:47:34.740210Z",
                            "agreementDate": "2022-08-16T13:03:40.030007Z"
                        },
                        {
                            "id": "112ecb90-12d8-4d0f-a8ad-b2d3e9e3fb6e",
                            "name": "Программа для построения фазовых портретов SEIR модели",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "06094ab7-ef81-43cc-9f6b-5a4cf1551b2e",
                                "name": "Соломатин Михаил Андреевич",
                                "email": "sma006@campus.mephi.ru"
                            },
                            "department": {
                                "id": "b1f0321d-06d1-4fa9-9449-9dcb5ee8759d",
                                "shortName": "14",
                                "name": "Кафедра электрофизических установок"
                            },
                            "creationDate": "2025-02-04T16:15:28.806448Z",
                            "agreementDate": "2025-03-07T15:38:55.532279Z"
                        },
                        {
                            "id": "140e614f-f074-4caa-ae88-c3cf151aac6a",
                            "name": "Программа расчёта интегральной остаточной намагниченности сверхпроводящей ленты",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "e20dfe44-b60d-42a0-8885-e22c9c4e9899",
                                "name": "Абин Дмитрий Александрович",
                                "email": "daabin@mephi.ru"
                            },
                            "department": {
                                "id": "08e85c9c-1946-47a2-b020-de14ca6fd33b",
                                "shortName": "70",
                                "name": "Кафедра физики твердого тела и наносистем"
                            },
                            "creationDate": "2024-12-22T19:46:52.882835Z",
                            "agreementDate": "2024-12-26T13:22:38.940775Z"
                        },
                        {
                            "id": "15322475-4907-4d6d-b038-eb1523f1a6e2",
                            "name": "Программа для нахождения и исследования численных решений нелинейного уравнения Шредингера с помощью нейросетевых методов",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "a5c73c67-cee6-4460-bdfe-d80a54d9d36e",
                                "name": "Сбоев Александр Георгиевич",
                                "email": "AGSboyev@mephi.ru"
                            },
                            "department": {
                                "id": "5d9980a2-c056-4091-a3e1-003bed5a6a0d",
                                "shortName": "91",
                                "name": "Кафедра компьютерного инженерного моделирования"
                            },
                            "creationDate": "2024-10-28T16:38:13.308272Z",
                            "agreementDate": "2024-11-27T15:55:58.716735Z"
                        },
                        {
                            "id": "19e64315-b5d7-4bb4-be8e-cf4b118905a7",
                            "name": "Программа для сжатия технологической информации архивных данных информационно-измерительной системы «Скала-микро»",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "145f0163-112f-4c31-b35d-ee2b4812cf34",
                                "name": "Букалин Алексей Олегович",
                                "email": "bao001@campus.mephi.ru"
                            },
                            "department": {
                                "id": "006a8729-3563-4630-bb1b-80542a127978",
                                "shortName": "22",
                                "name": "Кафедра кибернетики"
                            },
                            "creationDate": "2020-12-03T21:25:30.570935Z",
                            "agreementDate": "2021-02-08T12:44:51.900802Z"
                        },
                        {
                            "id": "1ef4c1d1-3793-453c-8b80-82fcce5edb17",
                            "name": "Программа драйвера коммуникации по протоколу PC5 для приложений V2X",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "35b827d4-ecf9-424f-903c-1491deadcb99",
                                "name": "Чугунков Илья Владимирович",
                                "email": "IVChugunkov@mephi.ru"
                            },
                            "department": {
                                "id": "c5be0664-12e3-418a-bb3c-038904bf9a12",
                                "shortName": "445",
                                "name": "Исследовательский центр в сфере искусственного интеллекта по направлению (Транспорт и логистика) НИЯУ МИФИ"
                            },
                            "creationDate": "2024-11-03T10:31:36.180749Z",
                            "agreementDate": "2024-11-28T14:33:53.432125Z"
                        },
                        {
                            "id": "1f5cceaf-2f50-4be9-ac50-c9fb12af1f8f",
                            "name": "Программа для расчета статических характеристик резонансно-туннельных диодов на основе GaN",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "3c39a5af-47a7-47f5-9bca-99cc0e4bcab3",
                                "name": "Гришаков Константин Сергеевич",
                                "email": "KSGrishakov@mephi.ru"
                            },
                            "department": {
                                "id": "cfd116a5-79f5-4676-8052-0e0a7f804f60",
                                "shortName": "401",
                                "name": "Институт функциональной ядерной электроники"
                            },
                            "creationDate": "2022-03-14T11:47:19.480280Z",
                            "agreementDate": "2022-06-24T13:30:29.689886Z"
                        },
                        {
                            "id": "1ff23596-c1fe-4d84-a372-0ca286a77788",
                            "name": "Программа для визуализации нейтронно-физического расчета ядерного реактора",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "145f0163-112f-4c31-b35d-ee2b4812cf34",
                                "name": "Букалин Алексей Олегович",
                                "email": "bao001@campus.mephi.ru"
                            },
                            "department": {
                                "id": "006a8729-3563-4630-bb1b-80542a127978",
                                "shortName": "22",
                                "name": "Кафедра кибернетики"
                            },
                            "creationDate": "2020-12-01T15:02:45.743721Z",
                            "agreementDate": "2021-02-08T12:45:08.232157Z"
                        },
                        {
                            "id": "221e2567-de7f-44a8-8916-815ab0499381",
                            "name": "Программа выделения ядросодержащих клеток c препаратов крови и костного мозга",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "bc2426b5-c510-4d17-bba6-e1c2fe9353ad",
                                "name": "Поляков Евгений Валерьевич",
                                "email": "evpolyakov@mephi.ru"
                            },
                            "department": {
                                "id": "047b3428-6162-4a19-b31f-b5421df15dde",
                                "shortName": "576",
                                "name": "Инженерно-физический институт биомедицины НИЯУ МИФИ"
                            },
                            "creationDate": "2023-07-13T09:53:15.881161Z",
                            "agreementDate": "2023-08-08T16:08:21.026621Z"
                        },
                        {
                            "id": "23e68f8a-11c1-48bd-9cca-a525e518b160",
                            "name": "Программа для нахождения радиометрических характеристик и шумов цифровых камер по итогам регистрации бинарного набора данных",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "48954579-ffbe-45d9-96f8-982ec483f2bd",
                                "name": "Козлов Александр Валерьевич",
                                "email": "domolink3730@yandex.ru"
                            },
                            "department": {
                                "id": "5d89742b-2fb6-4655-863c-acbd2cc28aba",
                                "shortName": "37",
                                "name": "Кафедра лазерной физики"
                            },
                            "creationDate": "2022-01-28T08:26:04.937714Z",
                            "agreementDate": "2022-03-14T14:28:13.642813Z"
                        },
                        {
                            "id": "2aa27089-65f7-45a9-80e3-ef99f35f0331",
                            "name": "Программа для расчета энергий и волновых функций структур с множеством квантовых ям в рамках 4x4 kp-Гамильтониана при наличии электрического поля и механически напряженных слоев",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "3c39a5af-47a7-47f5-9bca-99cc0e4bcab3",
                                "name": "Гришаков Константин Сергеевич",
                                "email": "KSGrishakov@mephi.ru"
                            },
                            "department": {
                                "id": "cfd116a5-79f5-4676-8052-0e0a7f804f60",
                                "shortName": "401",
                                "name": "Институт функциональной ядерной электроники"
                            },
                            "creationDate": "2023-03-24T08:58:34.713807Z",
                            "agreementDate": "2023-04-11T10:17:50.157990Z"
                        },
                        {
                            "id": "2c1ea5e6-d1c5-48cb-9367-1aa540b53476",
                            "name": "Программа для определения рациональных режимов сверления печатных плат из фольгированного стеклотекстолита",
                            "type": "PROGRAM",
                            "state": "CHECK_IN",
                            "creator": {
                                "id": "cf9a4d06-baf7-463a-916c-6e75bfb4e9aa",
                                "name": "Шульгин Алексей Николаевич",
                                "email": "ANShulgin@mephi.ru"
                            },
                            "department": {
                                "id": "a179377e-04e4-4d24-8bcb-3a67693dbb85",
                                "shortName": "257",
                                "name": "Снежинский физико-технический институт (СФТИ НИЯУ МИФИ)"
                            },
                            "creationDate": "2025-03-03T09:22:50.456504Z",
                            "agreementDate": "2025-03-18T11:54:27.777773Z"
                        },
                        {
                            "id": "2fa69550-7805-4fa9-9c87-85560b3621a3",
                            "name": "Программа для управления время-цифровыми преобразователями детектора ТРЕК",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "1414c352-31d9-4766-be97-077b08a32def",
                                "name": "Задеба Егор Александрович",
                                "email": "eazadeba@mephi.ru"
                            },
                            "department": {
                                "id": "d492928d-a780-4775-a2cf-93c5a62b1e95",
                                "shortName": "607",
                                "name": "Научно-образовательный центр НЕВОД"
                            },
                            "creationDate": "2022-12-26T16:31:36.200689Z",
                            "agreementDate": "2023-02-20T16:03:45.791497Z"
                        },
                        {
                            "id": "3234aa66-2706-4d95-9f87-876367c9894f",
                            "name": "Программа для ЭВМ «Система взаимодействия ГК Росатом со студентами НИЯУ МИФИ по вопросам карьерного сотрудничества»",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "733c35f4-89fe-4104-96e2-e1a4e6c26cab",
                                "name": "Крючков Георгий Константинович",
                                "email": "GKKryuchkov@mephi.ru"
                            },
                            "department": {
                                "id": "d4cffb9a-3864-4572-889e-ef395c8b3e43",
                                "shortName": "391",
                                "name": "Управление информационно-методического обеспечения образовательного процесса"
                            },
                            "creationDate": "2024-10-14T07:46:59.659847Z",
                            "agreementDate": "2024-11-06T15:56:34.932273Z"
                        },
                        {
                            "id": "371af877-7f78-4f48-9c9c-75e5a68898a5",
                            "name": "Программа для поиска полиномов с корнями, соответствующими положениям точечных вихрей в фоновом потоке",
                            "type": "PROGRAM",
                            "state": "CLOSED",
                            "creator": {
                                "id": "a734655b-c162-4a05-9d21-e420e31ef91c",
                                "name": "Байрамуков Алим Аубекирович",
                                "email": "alim.bayr@gmail.com"
                            },
                            "department": {
                                "id": "32b20f4d-7bc5-4970-b10a-fc11dcefd875",
                                "shortName": "31",
                                "name": "Кафедра прикладной математики"
                            },
                            "creationDate": "2022-06-25T03:10:58.803111Z",
                            "agreementDate": "2022-10-12T14:06:06.662836Z"
                        }
                    ],
                    "size": 20
                }
                """;
    }
}
