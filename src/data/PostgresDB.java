DROP TABLE IF EXISTS rooms;

CREATE TABLE rooms (
    id SERIAL PRIMARY KEY,
    room_number INT UNIQUE NOT NULL,
    type VARCHAR(50) NOT NULL,
    rooms_count INT NOT NULL,
    description TEXT,
    price DOUBLE PRECISION NOT NULL,
    is_occupied BOOLEAN DEFAULT FALSE
);

INSERT INTO rooms (room_number, type, rooms_count, description, price, is_occupied) VALUES
-- Standard
(101, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(102, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(103, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(104, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(105, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(106, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(201, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(202, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(203, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(204, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(205, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(206, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(301, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(302, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(303, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(304, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(305, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(306, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(401, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(402, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(403, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(404, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(405, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),
(406, 'Standard', 1, '1 спальня + санузел + душ', 15000, true),

-- Premium
(501, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(502, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(503, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(601, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(602, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(603, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(701, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(702, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(703, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(801, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(802, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),
(803, 'Premium', 2, '2 спальни + санузел + душ', 30000, true),

-- VIP
(999, 'VIP', 4, '6 комнаты + 2 санузел + 2 душ', 75000, true);
